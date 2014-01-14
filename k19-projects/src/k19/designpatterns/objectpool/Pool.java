package k19.designpatterns.objectpool;

public interface Pool<T> 
{
	T acquire();
	void release(T t);
}
