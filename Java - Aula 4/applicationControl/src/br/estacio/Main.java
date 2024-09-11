package br.estacio;

import br.estacio.model.Control;

public class Main {
	public static void main(String[] args) {
		
		Control control = new Control();
		
		control.setPower(true);
		
		control.info();
		
		control.increaseChannel();
		control.increaseVolume();
		
		control.info();
		
		control.mute();
		
		control.info();
		
		control.unmute();
		
		control.info();
		
		control.increaseVolume();
		
		control.info();
		
		control.mute();
		
		control.info();
		
		control.increaseVolume();
		control.increaseVolume();
		
		control.info();
	}
}
