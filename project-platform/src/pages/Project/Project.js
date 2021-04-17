import React from 'react';

const Project = (props) => {
  return (
    <div className="Project">
      Author: {props.match.params.authorUsername}
      <br />
      Project {props.match.params.projectId}
    </div>
  );
}

export default Project;