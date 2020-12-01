package com.jjc.common.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public abstract interface BaseMapper<T, E> {
	public abstract int countByExample(E paramE);

	@Deprecated
	public abstract int deleteByExample(E paramE);

	@Deprecated
	public abstract int deleteByPrimaryKey(Long paramLong);

	@Deprecated
	public abstract int insert(T paramT);

	public abstract int insertSelective(T paramT);

	public abstract List<T> selectByExample(E paramE);

	public abstract T selectByPrimaryKey(Long paramLong);

	public abstract int updateByExampleSelective(@Param("record") T paramT, @Param("example") E paramE);

	public abstract int updateByExample(@Param("record") T paramT, @Param("example") E paramE);

	public abstract int updateByPrimaryKeySelective(T paramT);

	public abstract int updateByPrimaryKey(T paramT);
}
