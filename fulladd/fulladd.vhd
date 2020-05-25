LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;

ENTITY fulladd IS
	PORT(a:IN STD_LOGIC;
			b:IN STD_LOGIC;
			cin:IN STD_LOGIC;
			s:OUT STD_LOGIC;
			count:OUT STD_LOGIC);
END fulladd;
ARCHITECTURE structure OF fulladd IS
COMPONENT halfadd
	PORT(a:IN STD_LOGIC;
			b:IN STD_LOGIC;
			s:OUT STD_LOGIC;
			co:OUT STD_LOGIC);
END COMPONENT;
SIGNAL temp1,temp2,temp3:STD_LOGIC;
BEGIN
	u0:halfadd PORT MAP(a,b,temp1,temp2);
	u1:halfadd PORT MAP(temp1,cin,s,temp3);
	count<=temp2 OR temp3;
END structure;
