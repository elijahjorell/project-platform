import React from 'react';
import {Link} from "react-router-dom";

const Post = ({ post }) => {
  return (
    <div className="Post">
      <Link to={"/" + post.author.username}>Go to author profile</Link>
      <br />
      <Link to={"/" + post.project.title + "/project/" + post.project.id}>Go to project</Link>
    </div>
  );
};

export default Post;