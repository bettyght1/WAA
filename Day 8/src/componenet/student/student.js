import react from "react";
import Students from "../students/students";
import "./student.css";

function Student(props){

const students =props.students;
return  students.map(s=> 
<div className ="grid-item">
    <h2>Student</h2>
 <p>Id: {s.id}</p>  
 <p>Name: {s.name}</p> 
 <p>Major: {s.major}</p> 
</div>);
}
export default Student