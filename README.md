# ASD-Project-OddJobs-App
Advanced Software Desgin Project, Uppsala University, Fall 2019

### REQUIREMENTS

* Java (OpenJDK) 1.0.8_232 or greater
* GNU Make 4.2.1 or greater

### USAGE

**Get the Repository**
```bash
	git clone https://github.com/SoBeRBot94/ASD-Project-OddJobs-App.git
```

**Compile**
```bash
	cd ASD-Project-OddJobs-App
	make Compile
```

*The compilation is verbose and the* ***stdout*** *is* ***piped*** *to* ***./javac.out***

```bash
		ll ./ClassFiles

		./ClassFiles
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94  1.1K Jan  6 18:14]  Admin.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   349 Jan  6 18:14]  BankPayment.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   663 Jan  6 18:14]  Constraints.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94  1.3K Jan  6 18:14]  Database.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   817 Jan  6 18:14]  Feedback.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   990 Jan  6 18:14]  Learner.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   679 Jan  6 18:14]  Logger.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   427 Jan  6 18:14]  Match.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   755 Jan  6 18:14]  Matcher.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   165 Jan  6 18:14]  Payment.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94  1.3K Jan  6 18:14]  Preferences.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   808 Jan  6 18:14]  Reception.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94  1.7K Jan  6 18:14]  Request.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94  2.9K Jan  6 18:14]  Requester.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94  2.8K Jan  6 18:14]  Responder.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   721 Jan  6 18:14]  Scheduler.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   337 Jan  6 18:14]  Swish.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   780 Jan  6 18:14]  Tracker.class
		├── [-rw-r--r-- SoBeRBot94 SoBeRBot94   390 Jan  6 18:14]  UserAPI.class
		└── [-rw-r--r-- SoBeRBot94 SoBeRBot94  2.6K Jan  6 18:14]  User.class

		0 directories, 20 files
```

**Clean**
```bash
	make clean
```
