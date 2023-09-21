<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<div id="main">
<h3>홈</h3>


<details>
<summary>SQL</summary>
<fieldset>
<pre>
drop table Account PURGE;
drop table review PURGE;

drop SEQUENCE account_seq;
drop SEQUENCE review_seq;

create SEQUENCE account_seq
    start with 1
    MAXVALUE 999999
    INCREMENT by 1
    NOCACHE
    NOCYCLE;
    

create SEQUENCE review_seq
    start with 1
    MAXVALUE 999999
    INCREMENT by 1
    NOCACHE
    NOCYCLE;


create table Account (
    idx         NUMBER              DEFAULT account_seq.nextval PRIMARY key,
    userid      VARCHAR2(100)       UNIQUE not null,
    userpw      VARCHAR2(500)       not null,
    salt        VARCHAR2(200)       not null,
    username    VARCHAR2(100)       not null
);

CREATE table review(
    idx             number          DEFAULT review_seq.nextval PRIMARY KEY,
    account_idx     number          not null,
    title           VARCHAR2(200)   not null,
    writer          VARCHAR2(100)   not null,
    content         VARCHAR2(1000)  not null,
    wdate           date            DEFAULT sysdate,
    filename        VARCHAR2(255)   not null,

    CONSTRAINT review_account_idx_fk
    FOREIGN key (account_idx)
    REFERENCES Account (idx)
);
</pre>
</fieldset>
</details>

<details open>
	<summary>ERD</summary>
	<img src="${cpath }/resources/test_ERD.png" width="600">
</details>
</div>
</body>
</html>