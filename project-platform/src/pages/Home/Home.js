import React, {useEffect, useState} from 'react';
import Feed from "../../components/Feed/Feed";
import {Link} from "react-router-dom";
import axios from "axios";

const Home = () => {
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/project-platform-backend/posts").then((res) => {
      console.log(res.data)
      setPosts(res.data);
    });
  }, []);

  return (
    <div className="Home">
      <Link to="/elijahjorell/project/1"><h1>Active Project</h1></Link>
      <Feed posts={posts}/>
    </div>
  );
};

export default Home;