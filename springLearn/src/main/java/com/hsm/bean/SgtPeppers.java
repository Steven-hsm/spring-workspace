package com.hsm.bean;

import org.springframework.stereotype.Component;

import com.hsm.bean.inter.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc{
	private static String title = "sgt";
	private static String artist="The Beatles";

	@Override
	public void play() {
		System.out.println("playing " + title + " by " + artist);
	}
}
