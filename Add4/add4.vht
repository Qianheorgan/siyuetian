-- Copyright (C) 1991-2013 Altera Corporation
-- Your use of Altera Corporation's design tools, logic functions 
-- and other software and tools, and its AMPP partner logic 
-- functions, and any output files from any of the foregoing 
-- (including device programming or simulation files), and any 
-- associated documentation or information are expressly subject 
-- to the terms and conditions of the Altera Program License 
-- Subscription Agreement, Altera MegaCore Function License 
-- Agreement, or other applicable license agreement, including, 
-- without limitation, that your use is for the sole purpose of 
-- programming logic devices manufactured by Altera and sold by 
-- Altera or its authorized distributors.  Please refer to the 
-- applicable agreement for further details.

-- ***************************************************************************
-- This file contains a Vhdl test bench template that is freely editable to   
-- suit user's needs .Comments are provided in each section to help the user  
-- fill out necessary details.                                                
-- ***************************************************************************
-- Generated on "05/25/2020 15:34:37"
                                                            
-- Vhdl Test Bench template for design  :  add4
-- 
-- Simulation tool : ModelSim-Altera (VHDL)
-- 

LIBRARY ieee;                                               
USE ieee.std_logic_1164.all;                                

ENTITY add4_vhd_tst IS
END add4_vhd_tst;
ARCHITECTURE add4_arch OF add4_vhd_tst IS
-- constants                                                 
-- signals                                                   
SIGNAL a : STD_LOGIC_VECTOR(3 DOWNTO 0);
SIGNAL b : STD_LOGIC_VECTOR(3 DOWNTO 0);
SIGNAL cin : STD_LOGIC;
SIGNAL co : STD_LOGIC;
SIGNAL so : STD_LOGIC_VECTOR(3 DOWNTO 0);
COMPONENT add4
	PORT (
	a : IN STD_LOGIC_VECTOR(3 DOWNTO 0);
	b : IN STD_LOGIC_VECTOR(3 DOWNTO 0);
	cin : IN STD_LOGIC;
	co : OUT STD_LOGIC;
	so : OUT STD_LOGIC_VECTOR(3 DOWNTO 0)
	);
END COMPONENT;
BEGIN
	i1 : add4
	PORT MAP (
-- list connections between master ports and signals
	a => a,
	b => b,
	cin => cin,
	co => co,
	so => so
	);
init : PROCESS                                               
-- variable declarations                                     
BEGIN                                                        
        -- code that executes only once                      
        a<="0000";b<="0000";wait for 20ns;
		  a<="0001";b<="0001";wait for 20ns;
		  a<="0010";b<="0010";wait for 20ns;
		  a<="0011";b<="0011";wait for 20ns;
		  a<="0100";b<="0100";wait for 20ns;
		  a<="0101";b<="0101";wait for 20ns;
		  a<="0110";b<="0110";wait for 20ns;
		  a<="0111";b<="0111";wait for 20ns;
		  a<="1000";b<="1000";wait for 20ns;
		  a<="1001";b<="1001";wait for 20ns;
		  a<="1010";b<="1010";wait for 20ns;
		  a<="1011";b<="1011";wait for 20ns;
		  a<="1100";b<="1100";wait for 20ns;
		  a<="1101";b<="1101";wait for 20ns;
		  a<="1110";b<="1110";wait for 20ns;
		  a<="1111";b<="1111";wait for 20ns;
			
END PROCESS init;                                           
always : PROCESS                                              
-- optional sensitivity list                                  
-- (        )                                                 
-- variable declarations                                      
BEGIN                                                         
        -- code executes for every event on sensitivity list  
			cin<='0';wait for 20ns;
			cin<='1';wait for 20ns;
END PROCESS always;                                          
END add4_arch;
