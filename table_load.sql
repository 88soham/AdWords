create or replace
procedure table_load
AUTHID CURRENT_USER as
begin
--execute immediate('DROP TABLE OUTONE');
--execute immediate('DROP TABLE OUTTWO');
--execute immediate('DROP TABLE OUTTHREE');
--execute immediate('DROP TABLE OUTFOUR');
--execute immediate('DROP TABLE OUTFIVE');
--execute immediate('DROP TABLE OUTSIX');
--execute immediate('DROP PROCEDURE TASKONE');
--execute immediate('DROP PROCEDURE TASKTWO');
--execute immediate('DROP PROCEDURE TASKTHREE');
--execute immediate('DROP PROCEDURE TASKFOUR');
--execute immediate('DROP PROCEDURE TASKFIVE');
--execute immediate('DROP PROCEDURE TASKSIX');
execute immediate('CREATE TABLE OUTONE(QID INTEGER, RANK INTEGER, ADVERTISERID INTEGER, BALANCE NUMBER, BUDGET NUMBER)');
execute immediate('CREATE TABLE OUTTWO(QID INTEGER, RANK INTEGER, ADVERTISERID INTEGER, BALANCE NUMBER, BUDGET NUMBER)');
execute immediate('CREATE TABLE OUTTHREE(QID INTEGER, RANK INTEGER, ADVERTISERID INTEGER, BALANCE NUMBER, BUDGET NUMBER)');
execute immediate('CREATE TABLE OUTFOUR(QID INTEGER, RANK INTEGER, ADVERTISERID INTEGER, BALANCE NUMBER, BUDGET NUMBER)');
execute immediate('CREATE TABLE OUTFIVE(QID INTEGER, RANK INTEGER, ADVERTISERID INTEGER, BALANCE NUMBER, BUDGET NUMBER)');
execute immediate('CREATE TABLE OUTSIX(QID INTEGER, RANK INTEGER, ADVERTISERID INTEGER, BALANCE NUMBER, BUDGET NUMBER)');
--execute immediate('create type token_obj is object(tok varchar2(500))');
--execute immediate('create type tokenList as table of token_obj');
--execute immediate('create type token_obj1 is object(aid integer)');
--execute immediate('create  type advID_table  as table of token_obj1');
--execute immediate('create type token_obj2 is object(rank number,aid integer)');
--execute immediate('create type ranks_table as table of token_obj');
end;

