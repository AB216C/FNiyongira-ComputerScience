import React from 'react';
import {useReducer} from 'react';
import shoppingCartReducer, { type ShoppingCartItem } from './ShoppingCartReducer';


const ShoppingCart:React.FC=()=> {
  const [cart, dispatch] = useReducer(shoppingCartReducer,[]);
  const handleAddItem =()=> {

    const newItem : ShoppingCartItem = {id:Date.now(), name:`Item ${cart.length+1}` };
    dispatch({type:'ADD_ITEM', payload:newItem})
  }

  const handleRemoveItem=(itemId:number)=>{
    dispatch({type:'REMOVE_ITEM', payload:itemId})

  }
  
  return(
    <div>
      <h2>Shopping Cart</h2>
      {
        cart.map(item=>(
          <div key={item.id} >
            {item.name} {' '}
            <button onClick={()=>handleRemoveItem(item.id)} >Remove Item</button>
          </div>
        ))
      }
      <button onClick={handleAddItem} >Add Item</button>
    </div>
  )
}

export default ShoppingCart;