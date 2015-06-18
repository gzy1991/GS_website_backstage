package net.gslab.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

	public abstract T load(Serializable id);

	public abstract List<T> loadAll();

	public abstract void save(T entity);

	public abstract void remove(T entity);

	public abstract void update(T entity);

	public abstract List<T> find(String hql);

	public abstract List<T> find(String hql, Object... params);
	public abstract int getCount(String table);
    public abstract List getListForPage(final String hql,final int offset,final int length);
}