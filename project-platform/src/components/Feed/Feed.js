import React from 'react';
import Post from "../Post/Post";

const posts = [
  {projectId: 1, authorUsername: "elijahjorell"},
  {projectId: 2, authorUsername: "vfwilliams"},
  {projectId: 3, authorUsername: "smithysmith"}
]

const Feed = () => {
  return (
    <div className="Feed">
      {
        posts.map((post) => {
          return (
              <Post projectId={post.projectId} authorUsername={post.authorUsername} />
          )
        })
      }
    </div>
  );
}

export default Feed;