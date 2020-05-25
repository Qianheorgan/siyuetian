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
-- Generated on "05/25/2020 14:24:27"
                                                            
-- Vhdl Test Bench template for design  :  halfadd
-- 
-- Simulation tool : ModelSim-Altera (VHDL)
-- 

LIBRARY ieee;                                               
USE ieee.std_logic_1164.all;                                

ENTITY halfadd_vhd_tst IS
END halfadd_vhd_tst;
ARCHITECTURE halfadd_arch OF halfadd_vhd_tst IS
-- constants                                                 
-- signals                                                   
SIGNAL a : STD_LOGIC;
SIGNAL b : STD_LOGIC;
SIGNAL co : STD_LOGIC;
SIGNAL s : STD_LOGIC;
COMPONENT halfadd
	PORT (
	a : IN STD_LOGIC;
	b : IN STD_LOGIC;
	co : OUT STD_LOGIC;
	s : OUT STD_LOGIC
	);
END COMPONENT;
BEGIN
	i1 : halfadd
	PORT MAP (
-- list connections between master ports and signals
	a => a,
	b => b,
	co => co,
	s => s
	);
init : PROCESS                                               
-- variable declarations                                     
BEGIN                                                        
     a<='0';b<='0';wait for 20ns; 
        a<='0';b<='1';wait for 20ns;
		  a<='1';b<='0';wait for 20ns;
		  a<='1';b<='1';wait for 20ns;                                
END PROCESS init;                                           
always : PROCESS                                              
-- optional sensitivity list                                  
-- (        )                                                 
-- variable declarations                                      
BEGIN                                                         
        -- code executes for every event on sensitivity list  
WAIT;                                                        
END PROCESS always;                                          
END halfadd_arch;
