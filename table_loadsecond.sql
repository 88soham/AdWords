create or replace
procedure table_loadsecond
AUTHID CURRENT_USER as
begin
execute immediate('create type token_obj is object(tok varchar2(500))');
execute immediate('create type tokenList as table of token_obj');
execute immediate('create type token_obj1 is object(aid integer)');
execute immediate('create  type advID_table  as table of token_obj1');
execute immediate('create type token_obj2 is object(rank number,aid integer)');
execute immediate('create type ranks_table as table of token_obj');
end;

