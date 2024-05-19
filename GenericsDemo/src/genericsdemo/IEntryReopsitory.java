
package genericsdemo;

public interface IEntryReopsitory<T > {
    
    void add(T entity);
    void delete(T entitiy);
    void update (T entitiy);
    
    
}
