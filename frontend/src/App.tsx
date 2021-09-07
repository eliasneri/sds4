import React from 'react';
import Navbar from 'components/Navbar';
import Footer from 'components/Footer';
import DataTable from 'components/DataTable';

function App() {
  return (
    <>
       <Navbar />
       <div className="container">
         <h2 className="text-primary">Olá Mundo</h2>
         <DataTable />
         
       </div>
        <Footer />
   </>
  );
}

export default App;
