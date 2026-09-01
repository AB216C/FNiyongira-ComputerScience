import { useContext } from 'react';
//import UserContext from '../Content/UserContext';
import { Container } from 'react-bootstrap';
import UserContext from './Content';
import useCartCount from './useCartCount';


function HomePage() {
  const { user } = useContext(UserContext);
  const cartCount = useCartCount();

  return (
    <Container className="mt-5">
      <h1>Welcome, {user.name}!</h1>
      <p>You are now {user.isLoggedIn ? 'logged in' : 'logged out'}.</p>
      <p>Your cart has {cartCount} item(s).</p>
    </Container>
  );
}

export default HomePage;