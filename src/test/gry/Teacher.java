package test.gry;

class Teacher extends People {
	String school;
	String subject;
	
	void say()
	{
		super.say();
		System.out.printf("I am a teacher, I'm %s from %s\n",name, school);
	}
}
