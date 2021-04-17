import React from 'react';
import Feed from "../../components/Feed/Feed";
import {Link} from "react-router-dom";

const Home = () => {
  return (
    <div className="Home">
      <Link to="/elijahjorell/project/1"><h1>Active Project</h1></Link>
      <Feed />
    </div>
  );
}

export default Home;