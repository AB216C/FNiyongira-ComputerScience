import React from 'react';
import { useAuth0 } from '@auth0/auth0-react';
import '../App.css'

const Header: React.FC = () => {
  const { loginWithRedirect, logout, isAuthenticated, user } = useAuth0();

  return (
    <div style={{ marginBottom: "5%",padding:'80px', backgroundColor: 'black', fontWeight:'bolder', color:'white'}}>
      {isAuthenticated ? (
        <div className="logout" >
          <div>
             <span style={{ padding:'20px', fontSize:'40px', fontWeight:'bold'}}>Welcome, {user?.name}</span>
          </div>
          <button onClick={() => logout({ logoutParams: { returnTo: window.location.origin } })} style={{ padding:'30px', fontSize:'50px', fontWeight:'bolder'}}>
            Logout
          </button>
        </div>
      ) : (
        <button onClick={() => loginWithRedirect()} style={{ padding:'10px', fontSize:'50px', fontWeight:'bolder'}} >
          Login
        </button>
      )}
    </div>
  );
};

export default Header;