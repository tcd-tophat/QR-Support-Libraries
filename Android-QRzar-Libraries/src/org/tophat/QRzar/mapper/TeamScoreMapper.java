package org.tophat.QRzar.mapper;

import java.util.Map;

import org.tophat.QRzar.models.TeamScore;
import org.tophat.android.exceptions.HttpException;
import org.tophat.android.mapping.GameList;
import org.tophat.android.model.Mapper;
import org.tophat.android.networking.ApiCommunicator;

public class TeamScoreMapper extends Mapper {

	public TeamScoreMapper(ApiCommunicator apic) {
		super(apic);
	}
	
	@Override
	protected TeamScore creator(Map<String, Object> data)
	{
		return new TeamScore(data);
	}
}
