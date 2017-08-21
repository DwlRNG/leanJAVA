CREATE TABLE 表名([   //创建表
属性名1 属性类型[完整性约束条件]， //最后一个不用接逗号
属性名2 属性类型 NOT NULL, //非空约束
属性名3 属性类型 PRIMARY KEY, //主键 唯一非空
属性名4 属性类型 UNIQUE,//唯一约束表中不能出现同样字段
属性名5 属性类型 PRIMARY KEY AUTO_INCREMENT //主键自增长
]);

DESC tablename; //查看表结构

ALTER TABLE OLDTABLENAME RENAME NEWTABLENAME; //修改表名

ALERT TABLE TABLENAME MODIFY 属性名 属性类型; //修改表数据类型

ALERT TABEL TABLENAME CHAINED 旧属性名 新属性名  属性类型;//修改表属性名

ALERT TABEL TABLENAME ADD 属性名 属性类型[完整性约束条件] ;//添加表属性

ALERT TABEL TABLENAME DROP 属性名 ; //移除表属性

ALERT TABEL TABLENAME DROP FOREIGN KEY 外键别名 ; //删除表外键

DROP TABLENAME ;//删除表

SELECT 列表属性 FROM TABLENAME;  //查询列表属性

SELECT 列表属性 FROM TABLENAME WHERE 条件表达式，条件表达式二; //条件查询

SELECT 列表属性 FROM TABLENAME WHERE IN (NUMBER1,NUMBER2);//在这个集合内

SELECT 列表属性 FROM TABLENAME WHERE 条件1 AND 条件二 ;//条件一和条件二

SELECT 列表属性 FROM TABLENAME WHERE 列表属性 LIKE '%占位符代表后面的或者前面的 _代表一个字符' ; //模糊查询

SELECT 列表属性 FROM TABLENAME WHERE 列表属性 IS NULL; //空值查询

SELECT 列表属性 FROM TABLENAME WHERE 条件1 OR 条件2 ;// 满足一种之一即可查询

SELECT DISTINCT 列表属性 FROM TABLENAME ; //查询结果不重复

SELECT * FROM GROUP BY 列表属性 ASC/DESC，列表属性 ASC/DESC;  //排序 ASC升序 DESC降序 

SELECT 需要分组的列表属性 GROUP_CONCAT(列表属性) FROM  表名 GROUP BY 列表属性; //分组查询 

SELECT * FROM 表名 LIMIT 初始位置，记录条数  //分页查询 

HAVING的使用（用来限制分组以后的条件）（SELECT 分组属性 ,COUNT(分组属性) ‘组别名’ FROM 表名 GROUP BY 分组属性 HAVING COUNT(分组属性)> < = 条件）

SELECT 属性名1,属性名2,表名.外键属性名,属性名3，属性名4
FROM 子表名，父表名
WHERE 从表名.外键属性名=主表名.主键属性





 














