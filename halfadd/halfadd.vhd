LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;


ENTITY halfadd IS 
  PORT (a: IN STD_LOGIC;
      b: IN STD_LOGIC;
		s: OUT STD_LOGIC;
		co: OUT STD_LOGIC);
 
 END halfadd;
 
 ARCHITECTURE rtl OF halfadd IS
   SIGNAL c,d:STD_LOGIC;
BEGIN
   c<=a OR b;
	d<=a NAND b;
	co<=NOT d;
	s<=c AND d;
END rtl;