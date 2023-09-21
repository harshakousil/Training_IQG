var students = [

    { name: "David", marks: 80 },

    { name: "Vinoth", marks: 77 },

    { name: "Divya", marks: 88 },

    { name: "Ishitha", marks: 95 },

    { name: "Thomas", marks: 68 }

  ];

 

  var result = "";

 

  for (var i = 0; i < students.length; i++) {

    var student = students[i];

    var grade = "";

 

    if (student.marks < 60) {

      grade = "F";

    } else if (student.marks < 70) {

      grade = "D";

    } else if (student.marks < 80) {

      grade = "C";

    } else if (student.marks < 90) {

      grade = "B";

    } else {

      grade = "A";

    }

 

    result += student.name + ": " + grade + "\n";

  }

 

  console.log("Grades:\n" + result);