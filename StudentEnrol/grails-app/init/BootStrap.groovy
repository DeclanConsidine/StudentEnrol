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
		
    }
    def destroy = {
    }
}
