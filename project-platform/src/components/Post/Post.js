import React from 'react';
import {Link} from "react-router-dom";

const Post = (props) => {
  return (
    <div className="Post">
      <Link to={"/" + props.authorUsername}>Go to author profile</Link>
      <br />
      <Link to={"/" + props.authorUsername + "/project/" + props.projectId}>Go to project {props.projectId}</Link>
    </div>
  );
};

export default Post;