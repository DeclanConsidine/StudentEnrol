import com.studentenrol.*
class BootStrap {

    def init = { servletContext ->
		def course1=new Course(title: 'Interactive Media with Animation',
		department: 'Computing',
		description:'''Lorem Ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora.''',

		leader:'Joe Jojo',
		code:'IMA101',
		startDate:new Date('19/01/2015'),
		endDate:new Date('19/01/2020')).save()
		
		def course2=new Course(title: 'Games Design',
		department: 'Computing',
		description:'''Lorem Ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora.''',

		leader:'Cletus Mcgee',
		code:'GD101',
		startDate:new Date('19/01/2015'),
		endDate:new Date('19/01/2020')).save()
		
		def course3=new Course(title: 'Computing For The Afraid',
		department: 'Computing',
		description:'''Lorem Ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora.''',

		leader:'Blooming Norman',
		code:'CFTA101',
		startDate:new Date('19/01/2015'),
		endDate:new Date('19/01/2020')).save()

		def student1=new Student(name: 'Reece Cope', 
		studentid: 'R33CE',
		email:'''LoremIpsum@dolor.com''',
		
		dob:new Date('19/01/1995'),
		username: 'lorem',
		password: 'ipsum',
		course: 'Web System Design').save()

		def student2=new Student(name: 'Connor Woolley', 
		studentid: 'CONNOR',
		email:'''Lorem2Ipsum@dolor.com''',
		
		dob:new Date('19/01/1995'),
		username: 'lorem2',
		password: 'ipsum2',
		course: 'Web System Design').save()

		def lecturer1=new Lecturer(name: 'Saeed Hassani',
		post: 'Lecturer',
		email:'SaeedHassani@gmail.com',
		department: 'Computing',
		subject: 'Networking',
		research:'''Networking and beyond''').save()

		def lecturer2=new Lecturer(name: 'Elizabeth Uruchurtu',
		post: 'Lecturer',
		email:'EUruchurtu@gmail.com',
		department: 'Computing',
		subject: 'Effective Design for Multimedia',
		research:'''Getting Tom to do work''').save()

		def leader1= new Leader(fullName: 'Dr Anne Roberts',
		post:'Senior Lecturer',
		subject:'Animation',
		email:'a.d.roberts@theUni.ac.uk',
		office:'Room 234',
		bio:'''Lorem Ipsum dolor sit alem, am aeufm fhhhxdd''').save()
		
		def leader2= new Leader(fullName: 'Dr Tonderai Maswera',
		post:'Senior Lecturer',
		subject:'Web Design',
		email:'T.Maswera@theUni.ac.uk',
		office:'Room 138',
		bio:'''Lorem Ipsum dolor sit alem, am aeufm fhhhxdd''').save()

		def module1= new Module(title:'Web Architectures',
		code: 'WA234',
		credits: 5,
		lecturer:'Dr Steve Crossbar',
		description:'''Lorem ipsum dollar blitzen etc ludus contentios, ut nam quadrae qunda''').save()
		
    }
    def destroy = {
    }
}
