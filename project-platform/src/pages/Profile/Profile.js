import React from 'react';

const projects = [
  {title: "Snake Game"}
]

const Profile = (props) => {
  return (
    <div className="Profile">
      {
        props.match.params.authorUsername
      }
      <br />
      {
        projects.map((project) => {
          return (
              <li>{project.title}</li>
          )
        })
      }
    </div>
  );
};

export default Profile;