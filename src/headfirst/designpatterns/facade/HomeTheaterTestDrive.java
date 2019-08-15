package headfirst.designpatterns.facade;

import headfirst.designpatterns.facade.facade.HomeTheaterFacade;
import headfirst.designpatterns.facade.subSystem.Amplifier;
import headfirst.designpatterns.facade.subSystem.CdPlayer;
import headfirst.designpatterns.facade.subSystem.DvdPlayer;
import headfirst.designpatterns.facade.subSystem.PopcornPopper;
import headfirst.designpatterns.facade.subSystem.Projector;
import headfirst.designpatterns.facade.subSystem.Screen;
import headfirst.designpatterns.facade.subSystem.TheaterLights;
import headfirst.designpatterns.facade.subSystem.Tuner;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
		Projector projector = new Projector("Top-O-Line Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, dvd, cd, 
						projector, screen, lights, popper);
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}
