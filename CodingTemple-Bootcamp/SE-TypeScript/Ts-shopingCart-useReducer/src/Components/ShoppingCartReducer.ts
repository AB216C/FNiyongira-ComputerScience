export interface ShoppingCartItem{
  id:number;
  name:string;
}

export type ShoppingCartAction = |{type:'ADD_ITEM';payload:ShoppingCartItem}|{type:'REMOVE_ITEM';payload:number}


const shoppingCartReducer = (state:ShoppingCartItem[], action:ShoppingCartAction):ShoppingCartItem[]=>{
  switch(action.type){
    case 'ADD_ITEM':
      return [...state,action.payload ];

    case 'REMOVE_ITEM':
      return state.filter(item=>item.id!==action.payload);
    
    default: 
      return state;
  }
}

export default shoppingCartReducer;