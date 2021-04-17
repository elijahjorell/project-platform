import './App.sass';
import {
  BrowserRouter as Router,
  Switch,
  Route
} from "react-router-dom";
import Home from "./pages/Home/Home";
import NotFound from "./pages/NotFound/NotFound";
import Navbar from "./components/Navbar/Navbar";
import Project from "./pages/Project/Project";
import Profile from "./pages/Profile/Profile";

function App() {
  return (
    <div className="App">
      <Router>
        <Navbar />
        <Switch>
          <Route path="/" exact component={Home} />
          <Route path="/:authorUsername" exact component={Profile} />
          <Route path="/:authorUsername/project/:projectId" exact component={Project} />
          <Route component={NotFound} />
        </Switch>
      </Router>
    </div>
  );
}

export default App;
