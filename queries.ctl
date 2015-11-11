load data infile 'Queries.dat'
into table queries
fields terminated by '\t'
(qid CHAR(100),query char(400))
