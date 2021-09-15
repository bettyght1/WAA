import React from 'react';
import reactDom from 'react-dom';
import Student from '../student/student';
import "./students.css";

const listOfStudents =[
    {
        'id': 111,
        'name': "Meti",
        'major': "CS"
    },
    {
        'id': 112,
        'name': "Tedros",
        'major': "CS"
    },
    {
        'id': 113,
        'name': "TPascal",
        'major': "CS"
    }  
]

function Students(){
    return <div class ="container"><Student students = {listOfStudents}/> </div>;
}
export default Students;