import React from "react";
import { BrowserRouter, Route, Switch } from "react-router-dom";
import Home from './Pages/Home';
import DashBoard from './Pages/DashBoard';

const Routes =() => {
    return(
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home />
                </Route>

                <Route path="/dashboard" >
                    <DashBoard />
                </Route>

            </Switch>

        
        </BrowserRouter>
    )
}

export default Routes;