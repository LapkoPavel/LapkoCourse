package com.springinaction.springidol;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import com.springinaction.springidol.qualifiers.StringedInstrument;

@Component("eddie")
public class Instrumentalist implements Performer
{
	public Instrumentalist(){}
	
	public void perform() throws PerformanceException
	{
		System.out.println("Playing "+ song+" : " );
		instrument.play();
	}
	
	private String song;
	
	public void setSong(String song)
	{
		this.song = song;
	}
	
	public String getSong()
	{
		return song;
	}
	
	public String screamSong()
	{
		return song;
	}

	private Instrument instrument;
	

	
	public void setInstrument(Instrument instrument)
	{
		this.instrument = instrument;
	}

}
