import axios from 'axios';
import React, { Component } from 'react';

import './FullPost.css';

const FullPost = (props) => {
    const baseURL = "http://localhost:8080/posts";
    function deleteHandler(){
        const  headers = {"Access-Control-Allow-Origin": "*"};
        axios
        .delete(`${baseURL}/${props.id}`)
        .then(()=>{
            //props.history.push("http://localhost:3000/");
            alert("Post deleted!");    
        })
    }
        let post = <p>Please select a Post!</p>;
        if(props.id !=null){
            post = (
                <div className="FullPost">
                    <p>{props.id}</p>
                    <h1>{props.title}</h1>
                    <p>{props.content}</p>
                    <div className="Edit">
                        <button onClick={deleteHandler} className="Delete">Delete</button>
                    </div>
                </div>
                 );
        }

       
        return post;
    }

export default FullPost;