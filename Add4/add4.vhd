LIBRARY IEEE;
USE IEEE.STD_logic_1164.ALL;
ENTITY add4 IS
     PORT(a,b: IN STD_LOGIC_VECTOR(3 DOWNTO 0);
          cin : IN STD_LOGIC;
          so: OUT STD_LOGIC_VECTOR(3 DOWNTO 0);
          co:OUT STD_LOGIC);
END add4;

ARCHITECTURE fouradder OF add4 IS
     SIGNAL temp0,temp1,temp2:STD_LOGIC;
COMPONENT fulladd
	PORT(a,b,cin:IN STD_LOGIC;
			s, count:OUT STD_LOGIC);
END COMPONENT;
BEGIN
	u0: fulladd PORT MAP(a(0),b(0),cin,so(0),temp0);
   u1: fulladd PORT MAP(a(1),b(1),temp0,so(1),temp1);
   u2: fulladd PORT MAP(a(2),b(2),temp1,so(2),temp2);
   u3: fulladd PORT MAP(a(3),b(3),temp2,so(3),co);
END fouradder;
