package com.github.unchama.buildassist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.plugin.java.JavaPlugin;

public class BuildAssist  extends JavaPlugin {
	@Override
	public void onEnable(){

	}
	@Override
	public void onDisable(){

	}
}
//ranklvの閾値
	public static final List<Integer> levellist = new ArrayList<Integer>(Arrays.asList(
			0,15,49,106,198,333,
			705,1265,2105,3347,4589,
			5831,7073,8315,9557,11047,
			12835,14980,17554,20642,24347,
			28793,34128,40530,48212,57430,
			68491,81764,97691,116803,135915,//30
			155027,174139,193251,212363,235297,
			262817,295841,335469,383022,434379,
			489844,549746,614440,684309,759767,
			841261,929274,1024328,1126986,1237856,
			1357595,1486913,1626576,1777412,1940314,
			2116248,2306256,2511464,2733088,2954712,//60
			3176336,3397960,3619584,3841208,4080561,
			4339062));