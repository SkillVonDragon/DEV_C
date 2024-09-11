package br.estacio.model;

public class Control {
	private int volume;
	private int channel;
	private int lastVolume;
	private Boolean isMuted;
	private Boolean power;
	
	public Control() {
		this.volume = 50;
		this.channel = 10;
		this.lastVolume = volume;
		this.isMuted = false;
		this.power = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setCanal(int canal) {
		this.channel = channel;
	}
	
	public Boolean getPower() {
		return power;
	}

	public void setPower(Boolean power) {
		this.power = power;
	}

	public Boolean isMuted() {
		return isMuted;
	}

	public void setMuted(Boolean isMuted) {
		this.isMuted = isMuted;
	}

	public void increaseVolume() {
		if (this.power) {
			if (this.volume < 100 && this.isMuted) {
				this.volume = this.lastVolume + 5;
				this.lastVolume = this.volume;
				this.isMuted = false;
			} else if (this.volume < 100 && !this.isMuted) {
				this.volume += 5;
				this.lastVolume = this.volume;
				this.isMuted = false;
			}
		}
	}
	
	public void decreaseVolume() {
		if (this.power) {
			if (this.volume > 0 && this.isMuted) {
				this.volume = this.lastVolume - 5;
				this.lastVolume = this.volume;
				this.isMuted = false;
			} else if (this.volume > 0 && !this.isMuted) {
				this.volume -= 5;
				this.lastVolume = this.volume;
				this.isMuted = false;
			}			
		}
	}
	
	public void mute() {
		if (this.power) {
			if (!this.isMuted) {
				this.lastVolume = this.volume;
				this.volume = 0;
				this.isMuted = true;
			}			
		}
	}
	
	public void unmute() {
		if (this.power) {
			if (this.isMuted) {
				this.volume = this.lastVolume;
				this.isMuted = false;		
			}			
		}
	}
	
	public void increaseChannel() {
		if (this.power) {
			if (this.channel < 100) {
				this.channel += 1;
			}			
		}
	}
	
	public void decreaseChannel() {
		if (this.power) {
			if (this.channel > 0) {
				this.channel -= 1; 
			}			
		}
	}
	
	public void info() {
		System.out.println("-----------------------");
		if (this.power) {
			System.out.println("Canal: " + this.getChannel());
			System.out.println("Volume: " + this.getVolume());			
		} else {
			System.out.println("TV Desligada");
		}
	}
}
