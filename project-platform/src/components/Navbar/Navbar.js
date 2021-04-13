import React from 'react';
import {Link} from "react-router-dom";

const Navbar = () => {
  return (
    <div className="Navbar">
      <Link to="/" exact>Home</Link>
    </div>
  );
}

export default Navbar;