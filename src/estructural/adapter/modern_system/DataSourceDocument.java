package estructural.adapter.modern_system;

import estructural.adapter.Document;

public interface DataSourceDocument<T extends Document> {

	void save(T entity);
	
	T retrive(Object id);
}
