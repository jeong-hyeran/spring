package com.itbank.repository;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

// java interface의 특징
// 생성자를 이용한 객체 생성이 불가능하다.
// 모든 필드에 public static final 속성이 자동으로 지정된다.
// 모든 메서드에 public abstract 속성이 자동으로 지정된다.

@Repository
public interface TestDAO {
	
	@Select("select banner from v$version")
	// 쿼리문을 여기에 적는다.(어노테이션의 종류가 다 따로있다. insert, delete, select 등)
	// 매개변수는 딱 한개만 넘길 수 있다. 여러개를 넘기고 싶을땐 해시맵을 사용한다.
	String getVersion();

}
