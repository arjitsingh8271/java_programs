class Phone {
	
	void call() {
		System.out.println("Calling.");
	}
	void sms() {
		System.out.println("Send Message.");
	}
}


interface Camera {
	
	void clickPhoto();
	void recoredVideo();
}

interface MusicPlayer {
	
	void playMusic();	
	void pushMusic();

}


class SmartPhone extends Phone implements Camera, MusicPlayer {
	
	void videoCall() {
		System.out.println("Video call Start");
	}

	@Override	
	public void call() {
		System.out.println("Smart Phone Calling.");
	}
	@Override
	public void sms() {
		System.out.println("Smart Phone Send Message.");
	}

	@Override
	public void clickPhoto() {
		System.out.println("Smart Phone Photo Clicked.");
	}
	@Override
	public void recoredVideo() {
		System.out.println("Smart Phone Recording Start.");
	}
	@Override
	public void playMusic() {
		System.out.println("Smart Phone Music Start");
	}
	@Override
	public void pushMusic() {
		System.out.println("Smart Phone Music Stop");
	}
	
}

class _02_MultipleInterface {

	public static void main(String[] args) {

		SmartPhone s = new SmartPhone();
		s.videoCall();

		s.call();
		s.sms();

		s.clickPhoto();
		s.recoredVideo();
		s.playMusic();
		s.pushMusic();


		// ------------------
		
		Phone p = new SmartPhone();
		p.call();
		p.sms();
		MusicPlayer mp = new SmartPhone();
		mp.playMusic();
		mp.pushMusic();
		Camera c = new SmartPhone();
		c.clickPhoto();
		c.recoredVideo();
	}
}
