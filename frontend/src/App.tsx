import React from 'react';
import Navbar from 'components/Navbar';
import Footer from 'components/Footer';
import DataTable from 'components/DataTable';
import Barchart from 'components/BarChart';
import Donutchart from 'components/DonutChart';

function App() {
  return (
    <>
       <Navbar />
       <div className="container">
         <h2 className="text-primary py-3">DashBoard de Vendas</h2>
            <div className="row px-3">
                <div className="col-sm-6">
                    <h5>Porcentagem de Sucesso</h5>
                    <Barchart />
                </div>

                <div className="col-sm-6">
                    <h5>Porcentagem da Rosca</h5>
                    <Donutchart />
                </div>


            </div>
         
         <DataTable />
         
       </div>
        <Footer />
   </>
  );
}

export default App;
