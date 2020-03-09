package com.evolution.utily;

import com.evolution.creature.Agent;

import java.util.Comparator;

public class SortBySense implements Comparator<Agent> {
	public int compare(Agent a, Agent b) {
		if ((b.getSense_range() - a.getSense_range() < 0)) {
			return -1;
		}
		if ((b.getSense_range() - a.getSense_range() > 0)) {
			return 1;
		}
		return 0;
	}
}
