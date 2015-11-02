
public class SingleGeneric<T> {

	private T type1;
	
	public SingleGeneric(T type){
		this.type1 = type;
		
	}
	
	public T getSingleGeneric(){
		return type1;
	}
	
	public void setSingleGeneric(T obj1){
		type1 = obj1;
	}
}
