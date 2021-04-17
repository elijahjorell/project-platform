import React from 'react';
import Post from "../Post/Post";

const Feed = ({ posts }) => {
  return (
    <div className="Feed">
      {
        posts.map((post) => {
          return (
              <Post post={post} key={post.id}/>
          );
        })
      }
    </div>
  );
}

export default Feed;