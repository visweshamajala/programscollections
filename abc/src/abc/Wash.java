package abc;
 class Wash<T> {
	T item;
	public void clean(T item){
		System.out.println("Clean"+item);
		
		
	}
	public class Laundrytime{
		public static void main(String[] args) {
			Wash wash= new Wash();
			wash.clean("socks");
		}
	}

}
