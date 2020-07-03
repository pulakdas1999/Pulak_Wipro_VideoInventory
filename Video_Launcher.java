import java.util.*;
class Video{
	String video_name;
	boolean checkout;
	int rating;
	public Video(){
		
	}
	public Video(String name){
		video_name=name;
	}
	public String getName() {
		return video_name;
	}
	public void docheckout() {
		this.checkout=true;
	}
	public void doreturn() {
		this.checkout=false;
	}
	public void receiverating(int rating) {
		this.rating=rating;
	}
	public int getrating() {
		return rating;
	}
	public boolean checkout() {
		return checkout;
	}
}
class VideoStore{
	Video[] store;
	public VideoStore(){
		store=new Video[5];
	}
	void addVideo(String name) {
		store[0]=new Video(name);
		System.out.println("Video "+name+" has been added successfully");
	}
	void docheckout(String name) {
		if(store[0].video_name.equals(name))
		{
			store[0].docheckout();
			System.out.println("Video "+name+" checked out successfully");
		}
	}
	void doreturn(String name) {
		if(store[0].video_name.equals(name))
		{
			store[0].doreturn();
			System.out.println("Video "+name+" returned successfully");
		}
	}
	void receiveRating(String name,int rating) {
		if(store[0].getName().equals(name))
		{
			store[0].receiverating(rating);
			System.out.println("Rating '"+rating+"' has been mapped to video "+name);
		}
	}
	void listInventory() {
		System.out.println("******************************************");
		System.out.println("Video Name | Checkout Status | Rating");
		System.out.println(store[0].getName()+"|" +store[0].checkout()+ "|"+ store[0].getrating());
		System.out.println("******************************************");
	}
}
public class Video_Launcher {

	public static void main(String[] args) {
		int ch;
		VideoStore video=new VideoStore();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1. Add Videos :");
			System.out.println("2. Check out Video :");
			System.out.println("3. Return Video :");
			System.out.println("4. Receive rating :");
			System.out.println("5. List Inventory :");
			System.out.println("6. Exit :");
			System.out.println("Enter your choice :");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter the name of the video :");
				video.addVideo(sc.next());
				break;
			case 2:
				System.out.print("Enter the name of the video you wanna checkout :");
				video.docheckout(sc.next());
				break;
			case 3:
				System.out.print("Enter the name of the video you wanna return :");
				video.doreturn(sc.next());
				break;
			case 4:
				System.out.print("Enter the name of the video you wanna rate :");
				String video_name_rate=sc.next();
				System.out.print("Enter the rating of the video :");
				int rating=sc.nextInt();
				video.receiveRating(video_name_rate, rating);
				break;
			case 5:
				video.listInventory();
				break;
			case 6:
				System.out.println("Exiting......!! Thanks for using the application");
				break;
			default:
				System.out.println("Wrong choice !!");
			}
		}while(ch!=6);
	}

}
