import React, { useState } from "react";
import Posts from "../Posts/Posts";
import Header from "../../components/Header/Header";
import { Link, Redirect, BrowserRouter, Switch, Route } from "react-router-dom";
import FullPost from "../../components/FullPost/FullPost";
import NewPost from "../../components/NewPost/NewPost";
import "./Blog.css";
import { FetchedPosts } from "../../Store/FetchedPosts";
import Login from "../../components/Login/Login";
import Authenticate from "../../components/Authenticate/Authenticate";

const Blog = () => {
  const [fetchedPosts, setFetchedPosts] = useState([]);
   return (
    
      <FetchedPosts.Provider value={{ fetchedPosts, setFetchedPosts }}>
        <div>
          <section>
            <Header />
          </section>

          <Switch>
            <Route path="/posts" component={Posts} />
            <Route path="/newpost" component={NewPost} />
            <Route path="/signin" component={Login} />
            <Route path="/authenticate" component={Authenticate} />
            <Route path="/posts/:id" component={FullPost} />
            <Redirect from="/" to="/posts" />
            <Redirect exact from="/" to="/posts" />{" "}
          </Switch>
        </div>
      </FetchedPosts.Provider>
   
  );
};

export default Blog;
